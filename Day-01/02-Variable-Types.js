//function functionName(){}
//function loginTest(userName, passWord){

//}


//loginTest(demosalesmanager, crmsfa); 

let gender = 'female'; //Global variable
function printGender(){
var age =25; // Function scoped variable - declared inside the function
let color = 'pink'; 
if (gender.startsWith('female')) {
    let maritalStatus = 'Married'
    console.log("She/Her");
    console.log("Inside the block using let :" + maritalStatus);
}else{
      console.log("He/Him");
}
   console.log("Inside the function block using Var :" + age);
   console.log("Inside the function block using let :" + color);
}
printGender();