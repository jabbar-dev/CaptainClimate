const mongoose = require('mongoose')

//Create Captains Schema

const CaptainSchema = new mongoose.Schema({

email:{
   type:String,
    required:true,
    minlength:3,
    maxlength:50,
},

 username:{
    type:String,
    required:true,
    minlength:3,
    maxlength:50,
 },

 name:{
    type:String,
    required:true,
    minlength:3,
    maxlength:50,
 },

 
 password:{
    type:String,
    required:true,
    minlength:3,
    maxlength:50,
 },

 completedTasks:{
     type:Number,
     required:false,
     minlength:0,
     maxlength:50
 },

 institution:{
   type: String,
   required:false,
   minlength:0,
   maxlength:100
 },

 age:{
   type:Number,
   required:false,
   minlenght:0,
   maxlength:50
 }


});

module.exports = new mongoose.model('Captains',CaptainSchema);