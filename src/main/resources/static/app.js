document.addEventListener('DOMContentLoaded', function () {
    const input = document.getElementById('number');

    document.getElementById('form').addEventListener('submit', function(event) {
        event.preventDefault();
        fetch('./api/converter' ,{
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body : JSON.stringify({
                number: input.value,
            })
        }).then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            return response.text();
        })
            .then(result => {
                document.getElementById('result').textContent = result;
            })
            .catch(error => {
                console.error('Error:', error);
                alert('There was a problem submitting the form.');
            });
    });

    // reset operation
    document.getElementById('reset-button').addEventListener('click', function(event) {
        document.getElementById('result').textContent = '';
    })
});