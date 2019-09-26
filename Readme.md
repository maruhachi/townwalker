# まちあるきスタンプ おたすけマップ
_全部いただくわ! － 《小原鞠莉》_

## 公式のめっちゃ扱いづらい一覧(png)をなんとかしたい
* とりあえずCSV化したやつ https://gist.github.com/maruhachi/ceddf855c04c6706c7fb303784b1563a
  1. GoogleDriveへ公式画像をアップ、アプリで開く⇒Googleドキュメント でOCR
  2. CSV => SQL(Insert) converter http://tools.nissuk.info/csv-insert/

## ローカル開発時
以下の設定が必要
* map.html ... ApiKeyをローカル開発用のものに差し替え
* IDE ... 環境変数に `spring_profiles_active=local` SpringBoot起動時のプロファイル指定 

### reference site
* [H2DB](https://github.com/maruhachi/townwalker/blob/master/src/main/resources/application.properties) ... [embeded H2DB on spring boot - Qiita](https://qiita.com/5zm/items/4916d517b45ca9dc5a4b)
* [Log groups](https://github.com/maruhachi/townwalker/blob/master/src/main/resources/application-local.properties) ... SpringBoot2.1からの[新機能](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-logging.html#boot-features-custom-log-groups)
* yahoo geo api
```
 02:31:04  ~/Src/cancel_list/csv_importer   master ✘ ✭ 
$ curl "https://map.yahooapis.jp/geocode/V1/geoCoder?appid=dj00aiZpPThtUUVCM3J0TThNeiZzPWNvbnN1bWVyc2VjcmV0Jng9MDk-&query=%E9%9D%99%E5%B2%A1%E7%9C%8C%E6%B2%BC%E6%B4%A5%E5%B8%82%E5%86%85%E6%B5%A6186&al=4&output=json"| jq
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100   849  100   849    0     0   7376      0 --:--:-- --:--:-- --:--:--  7382
{
  "ResultInfo": {
    "Count": 1,
    "Total": 1,
    "Start": 1,
    "Status": 200,
    "Description": "",
    "Copyright": "",
    "Latency": 0.034
  },
  "Feature": [
    {
      "Id": "22203.14.186",
      "Gid": "",
      "Name": "静岡県沼津市内浦重寺186",
      "Geometry": {
        "Type": "point",
        "Coordinates": "138.88999049,35.03354673",
        "BoundingBox": "138.88439049,35.02794673 138.89559049,35.03914673"
      },
      "Category": [],
      "Description": "",
      "Style": [],
      "Property": {
        "Uid": "cc3ce7bd2dd7505dd6becf04fe625a4119ae2e3c",
        "CassetteId": "b22fee69b0dcaf2c2fe2d6a27906dafc",
        "Yomi": "シズオカケンヌマヅシウチウラシゲデラ",
        "Country": {
          "Code": "JP",
          "Name": "日本"
        },
        "Address": "静岡県沼津市内浦重寺186",
        "GovernmentCode": "22203",
        "AddressMatchingLevel": "6",
        "AddressType": "地番・戸番"
      }
    }
  ]
}
```