### 一个项目设置两个Git地址，实现同时推送到两个Git仓库

#### 法一
给origin 增加一个可以push的地址
```git
git remote set-url --add origin 地址 //给origin添加一个远程push地址，这样一次push就能同时push到两个地址上面
git remote -v //查看是否多了一条push地址（这个可不执行）
```
至此，我们就可以直接一个push，同时推送到两个git地址。

```git
git push origin master -f // 如果第一次推不上去代码，可以使用强推的方式
```
这样一份代码就可以提交到两个git仓库上了

注意⚠️：如果需要删除
```git
git remote set-url --delete origin 地址
```
