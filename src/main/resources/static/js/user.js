//Отправка сообщений на сервер
function send() {
    //  var t = document.getElementById("username").value;

    $('#myform').submit(function (e) {
        e.preventDefault();

        var id = $("#username").val();
        var name = $("#password").val();
        var data = {
            id: id,
            name: name
        };

        $.ajax({
            type: $(this).attr('method'),
            url: $(this).attr('action'),
            data: $(this).serializeArray(),
            // async: false,
            //  headers: {
            //      'Accept': 'application/json',
            //      'Content-Type': 'application/json'
            //  },
            contentType: "application/json",
            dataType: "json",
            success: function (result) {
                alert('Форма отправлена');
            }
        });
    });

}

//Получение сообщений на сервер
function getData() {
    $('#myform').submit(function (e) {
        e.preventDefault();

        $.get(
            '/message',         // адрес отправки запроса
            // {par1:val1, par2:val2},  // передача с запросом каких-нибудь данных
            function (data) {
                $("#id").val(data[0]);  //значение
                $("#name").attr("placeholder", data[1]); //изменение атрибута
            }
        );
    });
}