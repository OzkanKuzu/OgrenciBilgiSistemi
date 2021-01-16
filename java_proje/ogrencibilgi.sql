-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 16 Oca 2021, 12:23:08
-- Sunucu sürümü: 10.4.14-MariaDB
-- PHP Sürümü: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `ogrencibilgi`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `ogrenci3`
--

CREATE TABLE `ogrenci3` (
  `Sıra` int(20) NOT NULL,
  `Ad` varchar(100) NOT NULL,
  `Soyad` varchar(100) NOT NULL,
  `Cinsiyet` varchar(100) NOT NULL,
  `Fakulte` varchar(100) NOT NULL,
  `Bolum` varchar(100) NOT NULL,
  `Numara` int(20) NOT NULL,
  `Sınıf` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `ogrenci3`
--

INSERT INTO `ogrenci3` (`Sıra`, `Ad`, `Soyad`, `Cinsiyet`, `Fakulte`, `Bolum`, `Numara`, `Sınıf`) VALUES
(1, 'asda', 'dsa', 'Erkek', 'Muhendislik', 'Bilgisayar muh', 12343, 2),
(2, 'asda', 'dsa', 'Erkek', 'Muhendislik', 'Bilgisayar muh', 12347, 4),
(4, 'sa', 'hasan', 'Kız', 'Teknoloji', 'Makine muh', 22222, 4),
(6, 'elif', 'demir', 'Kız', 'İletisim ', 'Elektrik ilt', 88888, 2),
(8, 'özkan', 'kuzu', 'Erkek', 'Muhendislik', 'Bilgisayar muh', 1234, 2),
(9, 'hasan', 'albay', 'Erkek', 'Muhendislik', 'Bilgisayar muh', 23445, 2);

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `ogrenci3`
--
ALTER TABLE `ogrenci3`
  ADD PRIMARY KEY (`Sıra`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `ogrenci3`
--
ALTER TABLE `ogrenci3`
  MODIFY `Sıra` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
