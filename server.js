import express from "express";
const app = require('./app')


const http = require('http')
const server = http.createServer(app);

server.listen(3000, console.log("Server is In the Air"));