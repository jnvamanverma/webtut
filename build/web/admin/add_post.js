/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function validateForm(){
    var title = document.forms["myform"]["title"].value;
    var body = document.forms["myform"]["body"].value;
    var category = document.forms["myform"]["category"].value;
    var author = document.forms["myform"]["author"].value;
    var tags = document.forms["myform"]["tags"].value;
    
    if(title == "" || body == "" || category == "" || author == "" || tags == ""){
        alert("Fill all the fields.");
        return false;
    }
    
}
