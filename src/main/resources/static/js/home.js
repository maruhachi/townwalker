var table = new Tabulator("#location-table", {
        ajaxURL:"/api/location", //ajax URL
        height:"400px",
        layout:"fitColumns",
        columns:[
            {title:"場所", field:"dest", sorter:"string"},
            {title:"住所", field:"address", sorter:"string"},
            {title:"メンバー", field:"member", sorter:"string"}
        ],
    });