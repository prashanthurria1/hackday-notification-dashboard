function fetchRecords() {
    const articleId = document.getElementById('articleIdInput').value;
    if (!articleId) {
        alert('Please enter an Article ID');
        return;
    }

    try {
        const response = await fetch(`http://localhost:8080/api/health`);
        if (!response.ok) {
            throw new Error(`HTTP error! Status: ${response.status}`);
        }

        const data = await response.json();

        const container = document.getElementById('recordsContainer');
        container.innerHTML = ''; // Clear previous results

        Object.keys(data).forEach(systemKey => {
            const systemRecords = data[systemKey];
            const systemHeader = document.createElement('h2');
            systemHeader.textContent = `${systemKey.toUpperCase()} Records`;
            container.appendChild(systemHeader);

            const table = document.createElement('table');
            table.innerHTML = `
                        <tr>
                            <th>ArticleID</th>
                            <th>CorrelationID</th>
                            <th>Milestone</th>
                            <th>System</th>
                            <th>Status</th>
                        </tr>
                    `;
            systemRecords.forEach(record => {
                const row = document.createElement('tr');
                row.innerHTML = `
                            <td>${record.articleID}</td>
                            <td>${record.correlationID}</td>
                            <td>${record.milestone}</td>
                            <td>${record.system}</td>
                            <td>${record.status}</td>
                        `;
                table.appendChild(row);
            });
            container.appendChild(table);
        });
    } catch (error) {
        console.error('Failed to fetch records:', error);
        alert('Failed to fetch records. See console for details.');
    }
}