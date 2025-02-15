
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


    $("#btnUpdate").click(function () {
        let customerData = {
            id: $("#userId").val(),
            name: $("#userName").val(),
            address: $("#userAddress").val(),
            age: parseInt($("#userAge").val()) // Ensure age is a number
        };

        $.ajax({
            url: "http://localhost:8080/BackEndPart_Web_exploded/api/vi/customer/update", // Corrected URL
            type: "PUT",
            contentType: "application/json",  // Ensure JSON format
            data: JSON.stringify(customerData),  // Convert to JSON
            dataType: "json",  // Expect JSON response
            success: function (response) {
                alert("Customer updated successfully!");
                console.log("Updated Customer:", response);
            },
            error: function (xhr) {
                alert("Error updating customer: " + xhr.responseText);
                console.error(xhr.responseText);
            }
        });
    });


    //delete done

    $("#btnDelete").click(function () {
        let userId = $("#userId").val(); // Get user ID from input field

        if (!userId) {
            alert("Please enter a User ID to delete.");
            return;
        }

        $.ajax({
            url: `http://localhost:8080/BackEndPart_Web_exploded/api/vi/customer/delete/${userId}`, // Correct URL
            type: "DELETE",
            success: function (response) {
                if (response) {
                    alert("Customer deleted successfully!");
                    console.log("Deleted Customer ID:", userId);
                } else {
                    alert("Customer not found!");
                }
            },
            error: function (xhr) {
                alert("Error deleting customer: " + xhr.responseText);
                console.error(xhr.responseText);
            }
        });
    });


    $("#btnViewAll").click(function () {
        $.ajax({
            url: "http://localhost:8080/BackEndPart_Web_exploded/api/vi/customer/getAll", // API endpoint
            type: "GET",
            dataType: "json", // Expect JSON response
            success: function (customers) {
                let tableBody = $("#userTableBody");
                tableBody.empty(); // Clear previous data

                customers.forEach(customer => {
                    let row = `<tr>
                    <td>${customer.id}</td>
                    <td>${customer.name}</td>
                    <td>${customer.address}</td>
                    <td>${customer.age}</td>
                </tr>`;
                    tableBody.append(row); // Append new row
                });

                alert("Customer data loaded successfully!");
            },
            error: function (xhr) {
                alert("Error loading customer data: " + xhr.responseText);
                console.error(xhr.responseText);
            }
        });
    });



