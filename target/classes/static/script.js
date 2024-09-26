let currentTaskId = null;


renderTasks();

function renderTasks() {
    var table = document.getElementById('table');

    if (table){
        var rowCount = table.rows.length;

        tasks.forEach(task => {

            var row = table.insertRow(rowCount);
                var cell0 = row.insertCell(0);
                var cell1 = row.insertCell(1);
                var cell2 = row.insertCell(2);
                var cell3 = row.insertCell(3);
                var cell4 = row.insertCell(4);
                cell0.innerHTML = rowCount;

                cell1.innerHTML = task.title;
                cell2.innerHTML = task.status;
                cell3.innerHTML = `<button class="btn btn-warning update" data-id="${task.id}">Update</button>`;
                cell4.innerHTML = `<button class="btn btn-danger delete" data-id="${task.id}">Delete</button>`;

                 rowCount++;
            });
    }

}

if(document.getElementById('table')){
    document.getElementById('table').addEventListener('click', function(e) {

        const taskId = e.target.dataset.id;
           if (e.target.classList.contains('delete')) {
               window.location = '/delete?taskId='+taskId;
           } else if (e.target.classList.contains('update')) {
               const taskToUpdate = tasks.find(task => task.id == taskId);
               currentTaskId = taskToUpdate.id;
               window.location = '/update?taskId='+currentTaskId;
           }
    });
}


