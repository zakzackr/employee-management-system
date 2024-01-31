# Employee Management System（従業員管理システム）
# 🐕 概要
従業員や部署を管理するwebアプリケーション
<br>

# ✨ Demo
![ems-app](https://github.com/zakzackr/employee-management-system/assets/100734822/758f48fe-e025-4c0c-8551-7e41ccf41f4c)
<br>    

# 🔗 URL
http://my-ems.s3-website-ap-northeast-1.amazonaws.com/

<br> <br>


# 💾 技術スタック
| Category | Tech Stack |
| ---- | ---- |
| Frontend | React.js |
| Backend | Spring Boot |
| Database | MySQL |
| Infrastructure | AWS(Elastic Beanstalk, S3, RDS) |
| Others | Git, GitHub |
<br>

# 📝 説明
従業員管理システムを使用することで、従業員の名前、メールアドレス、所属部署の管理を行うことができます。
    
### 主な操作：
**Employeesタブ**    
* 従業員の追加（Add Employee）:新しい従業員の入社    
* 従業員の更新（Update）：従業員の苗字やメールアドレスの変更、部署異動
* 従業員の削除（Delete）：従業員の退職
    
**Departmentsタブ**    
* 部署の追加（Add Departments）：新しい部署の追加
* 部署の更新（Update）：部署名の変更   
* 部署の削除（Delete）：部署の廃部
<br>

# 💻 学んだこと
* RESTというwebアーキテクチャスタイルについて
* 3層アーキテクチャの役割と実装
* @RestController, @Service, @Entityなどのアノテーションの使用方法
* CRUD（GET, POST, PUT, DELETE）操作の実装
* SpringのDIコンテナの役割
* React.jsでの関数コンポーネントの書き方
* Git、GitHubを使用したバージョン管理
* ビルドとは何か
* HTTPについて（リクエスト、レスポンス、ヘッダ、ボディ、ステータスコードなど）
<br>

3層アーキテクチャの詳細についてはこちらに記事（[【初心者向け】3層アーキテクチャ in Spring Boot](https://qiita.com/shibainuu/items/757c2e418459e4b51dd1)）にまとめたので、ご覧ください。    

<br>

# 💪 こだわりポイント
* コードの可読性向上と開発の高速化のため、Lombokライブラリをしたこと
* Lombokの@AllArgsConstructorアノテーションを使用したコンストラクタインジェクション
<br>
  

    
