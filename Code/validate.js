function validate() 
{
var name=document.reg.name.value;
  if(name==null || name == "" || name==" "|| name.length <3)
    {
    alert("Please Enter Name Correctly");
        return false;
    }
    var password = document.reg.password.value;
    if (password==null || password == "" || password==" "|| password.length <6) {
        alert("Enter password.. Minimum 6 characters");
        return false;
    }
    
var gender=document.reg.gender.value;
  if(gender == "")
    {
    alert("Specify Gender");
        return false;
    }
    return true;
}