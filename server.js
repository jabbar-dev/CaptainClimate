
const express = require("express");
const app = express();
const mongoose = require("mongoose");
const http = require('http')
const server = http.createServer(app);
require('dotenv').config();
const captainRoute = require('./routes/captains')

const PORT = process.env.PORT || 3000;

//MiddleWare
app.use(express.json());
app.use(express.urlencoded({extended:true}));


//Connect to MongoDB ATLAS
mongoose.connect(process.env.MONGO_URL,
{useNewUrlParser:true}

).then(()=>{
    console.log("Connected to MongoDB Atlas")
}).catch(()=>{

    console.log("Something Wrong With Database Connection")

})


//Routes
app.use('/api/captains',captainRoute);
app.use('/hi',(req,res,next)=>{

    res.status(200).json({
        message:'app is running on Port 3000'
    })
})

server.listen(PORT, console.log("Server is In the Air"));