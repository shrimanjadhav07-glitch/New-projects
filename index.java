<script>
    // Wait until DOM is fully loaded
    document.addEventListener("DOMContentLoaded", function () {

        const form = document.querySelector("form");
        const username = document.getElementById("username");
        const password = document.getElementById("password");

        form.addEventListener("submit", function (event) {
            event.preventDefault(); // Stop form submission

            // Trim input values
            const userValue = username.value.trim();
            const passValue = password.value.trim();

            // Validation
            if (userValue === "") {
                alert("Please enter your username or email.");
                username.focus();
                return;
            }

            if (passValue === "") {
                alert("Please enter your password.");
                password.focus();
                return;
            }

            if (passValue.length < 6) {
                alert("Password must be at least 6 characters long.");
                password.focus();
                return;
            }

            // Success (demo purpose)
            alert("Login successful!");

            // Uncomment this for real submission
            // form.submit();
        });
    });
</script>
