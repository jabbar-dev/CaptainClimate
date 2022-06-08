const express = require('express')

const app = express();

app.use((req,res,next)=>{

    res.status(200).json({
        message:'app is running on Port 3000'
    })

})


module.exports = app;