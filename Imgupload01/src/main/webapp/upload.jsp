<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>upload</title>
</head>
 <body>
        <h1>FileUpload �׽�Ʈ</h1>
        <form action="FileUploadTest" method="post" enctype="multipart/form-data">
            �ۼ���<input type="text" name="fileWriter"><br>
            ����<input type="file" name="fileName"><br>
            ���ϼ���<br/><textarea name="fileDescription" rows="5" cols="30"></textarea><br/><br/>
            <input type="submit" value="���ε�">
        </form>
    </body>
</html>