# Employee Management System（従業員管理システム）
# 🖊️ 概要
従業員や部署を管理するWebアプリケーション
<br>

# ✨ Demo
https://github.com/zakzackr/employee-management-system/assets/100734822/57a9316f-ad94-4a2f-a5f5-eed5045bda15


<br>    

# 🔗 URL
http://my-ems.s3-website-ap-northeast-1.amazonaws.com/<br>    
(↑AWS無料枠超過のためElastic Beanstalk、RDS停止中。フロントエンドの操作は可能です。)
<br>    
<br>    


# 💾 技術スタック
| Category | Tech Stack |
| ---- | ---- |
| Frontend | JavaScript, React |
| Backend | Java, Spring Boot |
| Database | MySQL |
| Infrastructure | AWS (Elastic Beanstalk, S3, RDS) |
| Others | Git, GitHub |
<br>

# 📊 ER図
<img width="640" alt="スクリーンショット 2024-11-18 15 28 33" src="https://github.com/user-attachments/assets/9eeddd27-c10f-4e6b-a067-bdcf8196b3a3">

# 📝 説明
従業員管理システムを使用することで、従業員の名前、メールアドレス、所属部署の管理を行うことができます。
    
### 主な操作：
**Employeesタブ**    
* 従業員の追加（Add Employee）：新しい従業員の入社    
* 従業員の更新（Update）：従業員の名字やメールアドレス、部署の変更、
* 従業員の削除（Delete）：従業員の退職
    
**Departmentsタブ**    
* 部署の追加（Add Departments）：新しい部署の追加
* 部署の更新（Update）：部署名の変更   
* 部署の削除（Delete）：部署の廃部
<br>

# 📈 作成の経緯
* リファクタリングや拡張が容易な3層アーキテクチャを理解する    
  ⇨ プレゼンテーション層、ビジネスロジック層、データアクセス層の役割の理解と実装方法の習得
* HTTPやRESTなどWeb開発の基本的な概念を理解する
* 各フレームワークやライブラリ（Spring Boot, React.js）の使用方法を学ぶ
* フロントエンド・バックエンド間での一連の流れ（Webページの表示、リクエストの送信、データベースに保存など）を理解する
<br>    
 
# 💻 学んだこと
* Webの基礎（HTTP, URI, RESTなど）
* 3層アーキテクチャの役割と実装
* CRUD（GET, POST, PUT, DELETE）操作の実装
* Spring Bootを使用したバックエンド開発
* React.jsを使用したフロントエンド開発
* Git、GitHubを使用したバージョン管理
* ビルドとは何か
<br>

3層アーキテクチャの詳細については、こちらの記事（[【初心者向け】3層アーキテクチャ in Spring Boot](https://qiita.com/shibainuu/items/757c2e418459e4b51dd1)）にまとめたので、ご覧ください。    
<br>

# 🌈 こだわりポイント
* 関心の分離と将来の機能拡張のため3層アーキテクチャを使用したこと
* コードの可読性向上と開発の高速化のため、Lombokライブラリをしたこと
* Lombokの@AllArgsConstructorアノテーションを使用したコンストラクタインジェクション
<br>

# 🔜 今後の計画
- [ ] Spring Securityを導入したログイン機能の追加　　　　    
- [ ] マルチユーザーに対応
<br>　　　　
  

    
