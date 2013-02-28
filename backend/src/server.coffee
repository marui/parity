express = require "express"
model = require "./model"

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
  tasks = model.Task.find (err, tasks) ->
    console.log tasks
    res.send tasks

app.listen 3000
console.log "Listening on port 3000..."