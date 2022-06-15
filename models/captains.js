const mongoose = require('mongoose')

//Create Captains Schema

const CaptainSchema = new mongoose.Schema({


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
     type:Integer,
     required:false,
     minlength:0,
     maxlength:50
 }


});

module.exports = new mongoose.model('Captains',CaptainSchema);