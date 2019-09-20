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