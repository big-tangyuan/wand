/*delete from Wand_Order_Wands;
delete from Wand_Ingredients;
delete from Wand;
delete from Wand_Order;
delete from Ingredient;

ALTER TABLE `test`.`ingredient`
CHANGE COLUMN `name` `name` VARCHAR(25) CHARACTER SET 'utf8' NOT NULL ,
CHANGE COLUMN `type` `type` VARCHAR(10) CHARACTER SET 'utf8' NOT NULL ;

insert into Ingredient (id,name,type)
                values ('m_gold', '黄金材质', 'material');
insert into Ingredient (id,name,type)
                values ('m_silver', '白银材质', 'material');
insert into Ingredient (id,name,type)
                values ('m_platinum', '铂金材质', 'material');
insert into Ingredient (id,name,type)
                values ('m_wood', '橡木材质', 'material');
insert into Ingredient (id,name,type)
                values ('d_feather', '羽毛', 'decorate');
insert into Ingredient (id,name,type)
                values ('d_horn', '独角兽的角', 'decorate');
insert into Ingredient (id,name,type)
                values ('d_foot', '幸运兔脚', 'decorate');
insert into Ingredient (id,name,type)
                values ('p_wind', '风', 'property');
insert into Ingredient (id,name,type)
                values ('p_thunder', '雷', 'property');
insert into Ingredient (id,name,type)
                values ('p_ice', '冰', 'property');

 */