<!doctype html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
    content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login</title>
</head>
<body>
    <nav><a href='./'>Home</a></nav>
    <form action="./private" method="POST">
    <div>
        <label for="username">Username</label>
        <input id="username" type="text" name="username" />
    </div>
    <div>
        <label for="ch2">Password</label>
        <input id="password" type="password" name="password" />
    </div>
    <div>
        <button type="submit">Login</button>
    </div>
</form>
</body>
</html>