
Task = mongoose.model 'Task', taskSchema
task = new Task name:"Dishes", description:"Wash the dishes", points: 5

task.save (err) -> 
  if (err)
    console.log 'meow'
