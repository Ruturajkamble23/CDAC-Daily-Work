const fs =require("fs");
console.log('start');
fs.readFile('Home.html','utf-8',(err,data)=>{
    if(err) throw err;
    console.log(data);
});
console.log('end')