

function Submit(){

    var FirstName=document.getElementById('FName').value;
    var LastName=document.getElementById('LName').value;
    var email = document.getElementById('email').value;
    var mobile = document.getElementById('mobile').value;
    var Gender=document.getElementById('Gender').value;
    var country=document.getElementById('country').value;
    if(FirstName===''||LastName===''|| email===''||Gender===''){
        alert("please fill all requirment");
        return false;
    }
    const message = `Name: ${FirstName} ${LastName}\nEmail: ${email}  \n Gender: ${Gender}\n  Country:${country} \n mobile: ${mobile}`;

    window.alert(message);
}mobile
function ResetForm(){

    document.getElementById('servyForm').reset();
}