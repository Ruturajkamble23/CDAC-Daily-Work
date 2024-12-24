//built in model ----http
const http =require('http');


const SERVER = http.createServer((req ,res)=>{
    res.end('Welcome Ruturaj');
});
SERVER.listen(9000);