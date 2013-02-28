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
