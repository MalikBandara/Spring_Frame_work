
    $("#btnSave").click(function () {
        let customerData = {
            id: $("#userId").val(),
            name: $("#userName").val(),
            address: $("#userAddress").val(),
            age: parseInt($("#userAge").val()) // Ensure age is sent as a number
        };

        $.ajax({
            url: "http://localhost:8080/BackEndPart_Web_exploded/api/vi/customer/save",
            type: "POST",
            contentType: "application/json",  // Ensure JSON format
            data: JSON.stringify(customerData),  // Convert to JSON
            dataType: "json",  // Expect JSON response
            success: function (response) {
                alert("Customer saved successfully!");
                console.log("Response:", response);
            },
            error: function (xhr) {
                alert("Error: " + xhr.responseText);
                console.error(xhr.responseText);
            }
        });
    });

