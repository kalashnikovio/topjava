const userAjaxUrl = "profile/meals/";

const ctx = {
    ajaxUrl: userAjaxUrl,
    updateTable: function () {
        $.ajax({
            type: "GET",
            url: "profile/meals/filter",
            data: $("#filter").serialize()
        }).done(updateTableMeals);
    }
};

function updateTableMeals(data) {
    ctx.datatableApi.clear().rows.add(data).draw();
}

function clearFilter() {
    $("#filter")[0].reset();
    $.get(userAjaxUrl, updateTableMeals);
}

$(function () {
    makeEditable(
        $("#datatable").DataTable({
            "paging": false,
            "info": true,
            "columns": [
                {
                    "data": "dateTime"
                },
                {
                    "data": "description"
                },
                {
                    "data": "calories"
                },
                {
                    "defaultContent": "Edit",
                    "orderable": false
                },
                {
                    "defaultContent": "Delete",
                    "orderable": false
                }
            ],
            "order": [
                [
                    0,
                    "desc"
                ]
            ]
        })
    );
});
