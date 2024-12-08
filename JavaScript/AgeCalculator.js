document.getElementById("ageForm").addEventListener("submit", function(event) {
    event.preventDefault(); 

    
    let day = document.getElementById("day").value;
    let month = document.getElementById("month").value;
    let year = document.getElementById("year").value;

   
    if (!day || !month || !year || day <= 0 || month <= 0 || month > 12 || day > 31) {
        alert("Please enter a valid date.");
        return;
    }

    let today = new Date();
    let birthDate = new Date(year, month - 1, day);

    
    let ageInMilliseconds = today - birthDate;
    let ageDate = new Date(ageInMilliseconds);

    let years = ageDate.getUTCFullYear() - 1970;
    let months = today.getMonth() - birthDate.getMonth();
    if (months < 0) {
        months += 12;
    }
    let days = today.getDate() - birthDate.getDate();
    if (days < 0) {
        days += new Date(today.getFullYear(), today.getMonth(), 0).getDate(); // Adjust days in the previous month
    }

    
    let result = `You are ${years} years, ${months} months, and ${days} days old.`;

   
    if (years >= 25) {
        result += "<br> ...";
    } else {
        result += "<br> ... ";
    }

    document.getElementById("result").innerHTML = result;
});
