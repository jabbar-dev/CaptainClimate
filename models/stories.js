const mongoose = require('mongoose')

//Create Stories Schema


const StoriesSchema = new mongoose.Schema({

    id:{
        type:Integer,
        required:false,
        maxlength:50,
        minlength:0
    },
    
    name:{
        type:String,
        required:true,
        minlength:3,
        maxlength:50,
     },


})