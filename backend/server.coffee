express = require "express"

mongoose = require "mongoose"
mongoose.connect 'localhost', 'parity'


actionSchema = mongoose.Schema
  user: mongoose.Schema.Types.ObjectId
  task: mongoose.Schema.Types.ObjectId
  added: 
    type: Date
    default: Date.now
  performed: 
    type: Date
    default: Date.now
  points: Number

taskSchema = mongoose.Schema
  added: 
    type: Date
    default: Date.now

  updated: 
    type: Date
    default: Date.now
  name: String
  description: String
  points: Number

userSchema = mongoose.Schema
  added: 
    type: Date
    default: Date.now
  name: String


Task = mongoose.model 'Task', taskSchema

task = new Task name:"Dishes", description:"Wash the dishes", points: 5

task.save (err) -> 
  if (err)
    console.log 'meow'
app = express()



app.get "/group", (req, res) ->
  res.send [
      name: "group1"
    ,
      name: "gruop2"
  ]

app.get "/group/:id", (req, res) ->
  res.send
    id: req.params.id
    name: "Group 1"
    description: "Test group"
    total_points: [
        user:"Ma Rui"
        points:55
      ,
        user:"Joakim"
        poins:66
    ]


app.get "/group/:id/task", (req, res) ->
  tasks = Task.find (err, tasks) ->
    console.log tasks
    res.send tasks

app.listen 3000
console.log "Listening on port 3000..."