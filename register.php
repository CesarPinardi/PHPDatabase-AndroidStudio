<?php
require "conn.php";
$name = $_POST["name"];
$surname = $_POST["surname"];
$age = $_POST["age"];
$username = $_POST["username"];
$password = $_POST["password"];
//LETRAS MAIUSCULAS NA QUERY
$mysql_qry = "INSERT INTO employee_data (name, surname, age, username, password) VALUES ('
$name','$surname','$age','$username','$password')";

if($conn->query($mysql_qry) === TRUE){
    echo "Insert successful";
        
}
else{
    echo "Error: " . $mysql_qry . "<br>" . $conn-> error;
}

$conn->close();
