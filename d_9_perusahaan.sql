-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 17 Jun 2022 pada 07.54
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 8.1.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `d_9_perusahaan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `departemen`
--

CREATE TABLE `departemen` (
  `id_departemen` int(6) NOT NULL,
  `nama_departemen` varchar(50) NOT NULL,
  `alamat` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `departemen`
--

INSERT INTO `departemen` (`id_departemen`, `nama_departemen`, `alamat`) VALUES
(1, 'HRD', 'Jl. Raya Solo no. 10 - Yogyakarta, Ngentak, Caturtunggal'),
(2, 'Sales', 'Jl. Raya Solo no. 10 - Yogyakarta, Ngentak, Caturtunggal'),
(3, 'Purchasing', 'Jl. Raya Solo no. 10 - Yogyakarta, Ngentak, Caturtunggal'),
(4, 'QA (Quality Assurance)', 'Jl. Raya Solo no. 51 - Yogyakarta, Ngentak, Caturtunggal'),
(5, 'Production', 'Jl. Raya Solo no. 51 - Yogyakarta, Ngentak, Caturtunggal');

-- --------------------------------------------------------

--
-- Struktur dari tabel `detail_transaksi`
--

CREATE TABLE `detail_transaksi` (
  `nomor_detail_transaksi` varchar(6) NOT NULL,
  `nomor_transaksi` varchar(6) NOT NULL,
  `jumlah_produk` int(20) NOT NULL,
  `jumlah_total_harga_produk` int(20) NOT NULL,
  `id_produk` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `detail_transaksi`
--

INSERT INTO `detail_transaksi` (`nomor_detail_transaksi`, `nomor_transaksi`, `jumlah_produk`, `jumlah_total_harga_produk`, `id_produk`) VALUES
('1', '1', 3, 1500, '1'),
('2', '2', 5, 5000, '2'),
('3', '3', 21, 31500, '3'),
('4', '4', 42, 210000, '4'),
('5', '5', 3, 30000, '5');

-- --------------------------------------------------------

--
-- Struktur dari tabel `karyawan`
--

CREATE TABLE `karyawan` (
  `id_karyawan` int(6) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `gaji` float NOT NULL,
  `id_departemen` int(6) NOT NULL,
  `bonus` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `karyawan`
--

INSERT INTO `karyawan` (`id_karyawan`, `nama`, `email`, `gaji`, `id_departemen`, `bonus`) VALUES
(1, 'Wahyu', 'wahyu@gmail.com', 3000000, 1, 0),
(2, 'Alfons', 'alfons@gmail.com', 3200000, 2, 100000),
(3, 'Kevin', 'kevin@gmail.com', 1700000, 3, 0),
(4, 'Anton', 'anton@gmail.com', 2000000, 4, 0),
(5, 'Nova', 'nova@gmail.com', 5000000, 5, 0),
(100, 'Tes', 'addsaklsk@gmail.com', 1000000, 2, 100000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `produk`
--

CREATE TABLE `produk` (
  `id_produk` varchar(6) NOT NULL,
  `nama_produk` varchar(100) NOT NULL,
  `harga_produk` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `produk`
--

INSERT INTO `produk` (`id_produk`, `nama_produk`, `harga_produk`) VALUES
('1', 'Beng-beng', 500),
('2', 'Sugus', 1000),
('3', 'Nextar', 1500),
('4', 'Kopi Signature', 5000),
('5', 'Sosis Kanz', 10000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `nomor_transaksi` varchar(6) NOT NULL,
  `tanggal_transaksi` varchar(10) NOT NULL,
  `id_karyawan` int(6) NOT NULL,
  `id_produk` varchar(6) NOT NULL,
  `jumlah_produk` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`nomor_transaksi`, `tanggal_transaksi`, `id_karyawan`, `id_produk`, `jumlah_produk`) VALUES
('1', '12/01/2022', 1, '1', 4),
('2', '10/3/2022', 2, '2', 2),
('3', '5/1/2020', 3, '3', 6),
('4', '10/10/2021', 4, '4', 2),
('5', '5/5/2022', 5, '5', 10);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `departemen`
--
ALTER TABLE `departemen`
  ADD PRIMARY KEY (`id_departemen`);

--
-- Indeks untuk tabel `detail_transaksi`
--
ALTER TABLE `detail_transaksi`
  ADD PRIMARY KEY (`nomor_detail_transaksi`);

--
-- Indeks untuk tabel `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`id_karyawan`);

--
-- Indeks untuk tabel `produk`
--
ALTER TABLE `produk`
  ADD PRIMARY KEY (`id_produk`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`nomor_transaksi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
