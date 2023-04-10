<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>ToDo</title>
      <link rel="stylesheet" type="text/css" href="/css/style.css"/>
</head>
<body>
<h1>To Do list</h1>
<h3>Add task to list</h3>
<form action="/add" method="post">
    <table border="1px">
        <tr>
            <td>
                <label>Task description</label>
                <input type="text" name="text">
            </td>
            <td>
                <input type="submit" value="add task">
            </td>

        </tr>

    </table>
</form>
<br>
<h2>Task list(task count : ${taskSize})</h2>
<table border="1px">
    <tr>
        <td>Id</td>
        <td>Task description</td>
        <td>Delete from list</td>
    </tr>
    <#list taskList as task>
    <tr>
        <td>${task.id}</td>
        <td>${task.text}</td>
        <td><a href="${'/delete/'+task.id}"">Delete</a></td>
    </tr>
    </#list>
</table>
</body>
</html>