const express = require("express");
const app = express();
const port = 8080;
const path = require("path");

app.use(express.urlencoded({extended: true}));

app.set("view engine", "ejs");
app.set("views", path.join(__dirname, "views"));
app.set(express.static(path.join(__dirname, "public")));

let posts = [
{
    username: "naresh kumar",
    content: "i love programming"    
},
{
    username: "ashish kumar",
    content: "building ai agents"    
},
{
    username: "Adobe",
    content: "Welcome Onboardig - Adobe Noida"    
}

];

app.get("/posts",(req,res) => {
    res.render("index.ejs");
});


app.listen(port, ()=>{
    console.log("listening to port: 8080");
});
