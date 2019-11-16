CREATE TABLE IF NOT EXISTS `roles` (
  `role_name` varchar(20) NOT NULL,
  PRIMARY KEY (`role_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `roles`
(`role_name`)
VALUES
('user');
INSERT INTO `roles`
(`role_name`)
VALUES
('admin');
