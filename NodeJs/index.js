const http = require('http');
const fs = require('fs');

const SERVER = http.createServer((req,res)=>{
    // console.log(req.url);
    switch(req.url){
        case "/":
            var filname="home.html";
            break;
        case "/about":
            var filname="about.html";
            break;
        case "/contact":
            var filname="contact.html";
            break;
        default:
            var filname="home.html";

    }

    console.log(filname);

    fs.readFile(filname , 'utf-8' , (err, data)=>{
        if (err) throw err;
        res.end(data);
    })
    
});

SERVER.listen(9000);