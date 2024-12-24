

const fs =require("fs");

console.log('start');
var ans = fs.readFileSync('Home.html','utf-8');
console.log(ans);
console.log('end');
