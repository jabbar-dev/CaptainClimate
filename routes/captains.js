const express = require('express');

const router = express.Router();
const Captain = require('../models/captains')


router.post('/',(req,res)=>{


    captain = new Captain({
        username:req.body.username,
        name:req.body.name,
        password:req.body.password,
        completedTasks:req.body.tasks,
        institution:req.body.institution,
        age:req.body.age
    })

    captain.save().then(captain =>{
      //  console.log(res)
        res.send(captain);
    }).catch(error=>{
        console.log(error)
        res.status(500).send(error)
    });
});

//GET ALL CAPTAINS
router.get('/',(req,res)=>{

    Captain.find()
    .then((captain)=>res.send({captains: captain}))
    .catch((error)=>{
        res.status(500).send("Cannot Get");
    });
})

//GET CAPTAIN BY ID
router.get("/:capId",(req, res)=>{

    Captain.findById(req.params.capId).then(captain=>{
        if(captain) res.send({captains: captain});
        res.status(404).json.send("Captain Not Found")
    })
    .catch((error)=>{
        res.status(500).send(error.message)
    })


})



module.exports = router;