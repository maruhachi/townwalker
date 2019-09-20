# まちあるきスタンプ おたすけマップ
_全部いただくわ! － 《小原鞠莉》_

## 公式のめっちゃ扱いづらい一覧(png)をなんとかしたい
* とりあえずCSV化したやつ https://gist.github.com/maruhachi/ceddf855c04c6706c7fb303784b1563a
  1. GoogleDriveへ公式画像をアップ、アプリで開く⇒Googleドキュメント でOCR
  2. CSV => SQL(Insert) converter http://tools.nissuk.info/csv-insert/

## ローカル開発時
以下の設定が必要
* map.html ... ApiKeyをローカル開発用のものに差し替え
* IDE ... SpringBoot起動時のプロファイル指定 環境変数に `spring_profiles_active=local`

### reference site
* embeded H2DB on spring boot https://qiita.com/5zm/items/4916d517b45ca9dc5a4b