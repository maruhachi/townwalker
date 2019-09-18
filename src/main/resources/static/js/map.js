function initMap() {
    // 内浦を表示する
    var defaultSettings = {zoom: 15, center: {lat: 35.021374, lng: 138.883168}};
    var map = new google.maps.Map(
        document.querySelector('#map'),
        defaultSettings
    );
}