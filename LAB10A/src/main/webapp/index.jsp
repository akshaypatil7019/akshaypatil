<!DOCTYPE html>
<html>
<head>
<title>User Form</title>

<script>
function validateForm() {
    var name = document.forms["myForm"]["uname"].value;
    var email = document.forms["myForm"]["email"].value;
    var desig = document.forms["myForm"]["desig"].value;

    if (name == "" || email == "" || desig == "") {
        alert("All fields must be filled!");
        return false;
    }

    var emailPattern = /^[^ ]+@[^ ]+\.[a-z]{2,3}$/;
    if (!email.match(emailPattern)) {
        alert("Invalid Email format!");
        return false;
    }

    return true;
}
</script>

</head>
<body>

<h2>User Details Form</h2>

<form name="myForm" action="UserDataServlet" method="post" onsubmit="return validateForm()">
    Username: <input type="text" name="uname"><br><br>
    Email: <input type="text" name="email"><br><br>
    Designation: <input type="text" name="desig"><br><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>