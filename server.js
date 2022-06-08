const app = require('./app')

const mongoose = require('mongoose')
const http = require('http')
const server = http.createServer(app);

//Connect to MongoDB ATLAS
mongoose.connect("mongodb+srv://Jabbar-dev:GQwvOmhWJgwtSHEX@cluster0.ny21o2w.mongodb.net/?retryWrites=true&w=majority")


server.listen(3000, console.log("Server is In the Air"));