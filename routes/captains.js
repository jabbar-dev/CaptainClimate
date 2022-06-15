const express = require('express');

const router = express.Router();
const Captain = require('../models/captains')


router.post('/',(req,res)=>{


    captain = new Captain({
        username:req.body.username,
        name:req.body.name,
        password:req.body.password,
        completedTasks:req.body.tasks
    })

    captain.save().then(captain =>{
      //  console.log(res)
        res.send(captain);
    }).catch(error=>{
        console.log(error)
        res.status(500).send(error)
    });
});


module.exports = router