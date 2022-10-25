-- Customers ın tüm elemanları
Select ContactName Adi,CompanyName SirketAdi,City Sehir from Customers

Select * from Customers where City= 'London' --Şehri londra olanların tüm satırını getir.

Select * from Products --Products ın tümünü getirir.

Select * from Products where CategoryID=1 or CategoryID=3 --kategori id si 1 ya da 3 olan ürünleri getir

Select * from Products where CategoryID=1 and UnitPrice>=10 --kategori id si 1 ve fiyatı 10 dan büyük olan ürünleri getir

Select * from Products order by ProductName -- Ürünleri adlarına göre sıralayarak getir.

Select * from Products order by CategoryID,ProductName -- Ürünleri Id lerine göre sırala,sıralananları da ürün adlarına göre sırala.

Select * from Products order by UnitPrice asc --ascending(artan) , descending(azalan) Ürünleri fiyatları artana göre sıralara.

Select * from Products where CategoryID=1 order by UnitPrice desc --Ürünlerin categori id si 1 olanları azalan fiyata göre sırala.

Select count(*) from Products -- Ürün sayısını göster.

Select count(*) from Products where CategoryID=2 --Kategori id si 2 olan kaç ürün var

Select CategoryID, count(*) from Products group by CategoryID --Kategori id lerini grupla ve kaç ürün olduğunu göster.

Select CategoryID, count(*) from Products group by CategoryID having count(*)<10  --Kategori id lerine göre grupla ve sayısı 10 dan az olanları göster

Select CategoryID, count(*) from Products where UnitPrice>20 group by CategoryID  --Kategori id lerini grupla ve fiyatı 20 den büyük olanların sayısını göster

Select * from Products inner join Categories on Products.CategoryID=Categories.CategoryID --kategori id leri aynı olan ürün ve kategorileri birleştir.

Select Products.ProductID ,Products.ProductName , Products.UnitPrice,Categories.CategoryName from Products inner join Categories on Products.CategoryID=Categories.CategoryID --kategori id leri aynı olan ürün ve kategorileri birleştir ve ürünlerde ürün id ürün adı ürün fiyatını , kategoride kategori adını getir..

Select * from Products p left join [Order Details] od on p.ProductID=od.ProductID -- ürün id leri aynı olanları birleştir ve ürünlerde olup sipariş detayında olmayanları da ekle,göster.

Select * from Customers c left join Orders o on c.CustomerID=o.CustomerID where o.CustomerID is null --Müşteri id leri aynı olanları birleştir ve müşteri de olup siparişte müşteri id si null olanları göster








