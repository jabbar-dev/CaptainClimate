const app = require('./app')
const express = require("express");
const mongoose = require("mongoose");
const http = require('http')
const server = http.createServer(app);
require('dotenv').config();

//Connect to MongoDB ATLAS
mongoose.connect(process.env.MONGO_URL,
{useNewUrlParser:true}

).then(()=>{
    console.log("Connected to MongoDB Atlas")
}).catch(()=>{

    console.log("Something Wrong With Database Connection")

})


server.listen(3000, console.log("Server is In the Air"));