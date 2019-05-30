<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>HttpMessageConverter Demo</title>
</head>
<body>
<div id="resp"></div>
<input type="button" onclick="req()" value="请求">
<script type="text/javascript" src="assets/js/jquery-2.2.3.min.js"></script>
<script>
    function req() {
        $.ajax({
            url: "convert",
            data: "1-wangyunfei",
            type: "POST",
            contentType: "application/x-wen",
            success: function (data) {
                $("#resp").html(data);
            },
            error: function (data) {
                $("#resp").html(data);
            }
        });
    }
</script>
</body>
</html>