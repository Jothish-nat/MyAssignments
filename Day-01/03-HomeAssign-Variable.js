const browserVersion = 124;
let browserName = 'chrome';
function getBrowserVersion()
{
  if (browserName=="chrome")
 {  
    var browserVersion = 125;  
 }
 console.log("Inside the function block using Var :" + browserVersion);
 console.log("Inside the function block using Let :" + browserName);
}
getBrowserVersion();
console.log(browserVersion);