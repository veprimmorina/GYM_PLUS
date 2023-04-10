USE [master]
GO

/****** Object:  Database [GymPlus2] ******/
CREATE DATABASE [GymPlus2]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'GymPlus2', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\GymPlus2.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'GymPlus2_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\GymPlus2_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [GymPlus2] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [GymPlus2].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [GymPlus2] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [GymPlus2] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [GymPlus2] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [GymPlus2] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [GymPlus2] SET ARITHABORT OFF 
GO
ALTER DATABASE [GymPlus2] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [GymPlus2] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [GymPlus2] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [GymPlus2] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [GymPlus2] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [GymPlus2] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [GymPlus2] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [GymPlus2] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [GymPlus2] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [GymPlus2] SET  DISABLE_BROKER 
GO
ALTER DATABASE [GymPlus2] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [GymPlus2] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [GymPlus2] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [GymPlus2] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [GymPlus2] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [GymPlus2] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [GymPlus2] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [GymPlus2] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [GymPlus2] SET  MULTI_USER 
GO
ALTER DATABASE [GymPlus2] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [GymPlus2] SET DB_CHAINING OFF 
GO
ALTER DATABASE [GymPlus2] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [GymPlus2] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [GymPlus2] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [GymPlus2] SET QUERY_STORE = OFF
GO
USE [GymPlus2]
GO


SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Personi](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Emri] [varchar](150) NULL,
	[Mbiemri] [varchar](150) NULL,
	[DataERegjistrimit][date] NULL,
	[TraineriID][int]NULL,
 CONSTRAINT [PK_Personi] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Traineri]  ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Traineri](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Emri] [varchar](150)NOT NULL,
	[Mbiemri] [varchar](150) NOT NULL,
	
	
 CONSTRAINT [PK_Traineri] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object: Table[dbo].[Classes] ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Classes](
    [ID][int] IDENTITY(1,1) NOT NULL,
	[Fillon] [time] NOT NULL,
	[Mbaron] [time] NOT NULL,
	[TraineriID][int] NULL,
	
CONSTRAINT [PK_Classes] PRIMARY KEY CLUSTERED
(
   [ID] ASC
)WITH (PAD_INDEX=OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY=OFF, ALLOW_ROW_LOCKS=ON, ALLOW_PAGE_LOCKS=ON) ON [PRIMARY]
)ON [PRIMARY]
GO
/****** Obkect: Table[dbo].[Equipments] ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Equipments](
   [ID][int] IDENTITY(1,1)NOT NULL,
   [Paisjet] [varchar] (150) NOT NULL,
   [ClassesID] [int]  NULL,

CONSTRAINT [PK_Equipments] PRIMARY KEY CLUSTERED
(
  [ID] ASC
)WITH (PAD_INDEX=OFF, STATISTICS_NORECOMPUTE= OFF, IGNORE_DUP_KEY=OFF, ALLOW_ROW_LOCKS=ON, ALLOW_PAGE_LOCKS=ON) ON [PRIMARY]
)ON[PRIMARY]
GO

/****** Object: Table[dbo].[Fees] ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Fees](
   [ID][int] IDENTITY(1,1) NOT NULL,
   [Kohezgjatja ne muaj] [int] NULL,
   [Cmimi] [int] NULL,
   [PersoniID] [int] NULL,

CONSTRAINT [PK_Fees] PRIMARY KEY CLUSTERED
(
 [ID] ASC
)WITH (PAD_INDEX=OFF, STATISTICS_NORECOMPUTE=OFF, IGNORE_DUP_KEY=OFF, ALLOW_ROW_LOCKS=ON, ALLOW_PAGE_LOCKS=ON)ON [PRIMARY]
)ON[PRIMARY]
GO


INSERT [dbo].[Personi] ([Emri], [Mbiemri], [Data e regjistrimit],[TraineriID]) VALUES (N'Rinesa', N'Rexhepi', CAST(N'2020-02-01' AS Date),1)
INSERT [dbo].[Personi] ([Emri], [Mbiemri], [Data e regjistrimit],[TraineriID]) VALUES (N'Gent',N'Bresa', CAST(N'2019-09-19' AS Date),NULL)
INSERT [dbo].[Personi] ([Emri], [Mbiemri], [Data e regjistrimit],[TraineriID]) VALUES (N'Veprim',N'Morina', CAST(N'2020-03-20' AS Date),2)
INSERT [dbo].[Personi] ([Emri], [Mbiemri], [Data e regjistrimit],[TraineriID]) VALUES (N'Abedin',N'Telaku', CAST(N'2019-06-25' AS Date),NULL)
INSERT [dbo].[Personi] ([Emri], [Mbiemri], [Data e regjistrimit],[TraineriID]) VALUES (N'Leke','Dalladagu', CAST(N'2019-12-15' AS Date), 3)
INSERT [dbo].[Personi] ([Emri], [Mbiemri], [Data e regjistrimit],[TraineriID]) VALUES (N'Ross','Geller', CAST(N'2020-02-04' AS Date), NULL)
INSERT [dbo].[Personi] ([Emri], [Mbiemri], [Data e regjistrimit],[TraineriID]) VALUES (N'Rachel','Green', CAST(N'2019-10-05' AS Date), 4)
SET IDENTITY_INSERT [dbo].[Personi] OFF

INSERT [dbo].[Traineri] ([Emri], [Mbiemri]) VALUES (N'Cody', N'Ko')
INSERT [dbo].[Traineri] ([Emri], [Mbiemri]) VALUES (N'Kurtiss', N'Conner')
INSERT [dbo].[Traineri] ([Emri], [Mbiemri]) VALUES (N'John', N'Smith')
INSERT [dbo].[Traineri] ([Emri], [Mbiemri]) VALUES (N'Donna', N'Marie')
INSERT [dbo].[Traineri] ([Emri], [Mbiemri]) VALUES (N'Erika', N'Gate')
SET IDENTITY_INSERT [dbo].[Traineri] OFF

INSERT [dbo].[Classes] ([Fillon],[Mbaron],[TraineriID]) VALUES(CAST(N'8:00' AS TIME), CAST(N'10:30' AS TIME),NULL)
INSERT [dbo].[Classes] ([Fillon],[Mbaron],[TraineriID]) VALUES(CAST(N'11:00' AS TIME), CAST(N'12:30' AS TIME),NULL)
INSERT [dbo].[Classes] ([Fillon],[Mbaron],[TraineriID]) VALUES(CAST(N'13:00' AS TIME), CAST(N'14:30' AS TIME),NULL)
INSERT [dbo].[Classes] ([Fillon],[Mbaron],[TraineriID]) VALUES(CAST(N'15:00' AS TIME), CAST(N'16:30' AS TIME),NULL)
INSERT [dbo].[Classes] ([Fillon],[Mbaron],[TraineriID]) VALUES(CAST(N'17:00' AS TIME), CAST(N'18:30' AS TIME),NULL)
INSERT [dbo].[Classes] ([Fillon],[Mbaron],[TraineriID]) VALUES(CAST(N'19:00' AS TIME), CAST(N'20:30' AS TIME),NULL)
INSERT [dbo].[Classes] ([Fillon],[Mbaron],[TraineriID]) VALUES(CAST(N'21:00' AS TIME), CAST(N'22:30' AS TIME),NULL)
SET IDENTITY_INSERT[dbo].[Classes] OFF

INSERT [dbo].[Equipments] ([Paisjet], [ClassesID]) VALUES(N'Treadmills',NULL)
INSERT [dbo].[Equipments] ([Paisjet], [ClassesID]) VALUES(N'Ellipticals',NULL)
INSERT [dbo].[Equipments] ([Paisjet], [ClassesID]) VALUES(N'Stationery Bikes',NULL)
INSERT [dbo].[Equipments] ([Paisjet], [ClassesID]) VALUES(N'Aerobic steppers',NULL)
INSERT [dbo].[Equipments] ([Paisjet], [ClassesID]) VALUES(N'Weight machines',NULL)
SET IDENTITY_INSERT[dbo].[Equipments] OFF


INSERT[dbo].[Fees] ([Kohezgjatja ne muaj],[Cmimi],[PersoniID]) VALUES(1,100,4)
INSERT[dbo].[Fees] ([Kohezgjatja ne muaj],[Cmimi],[PersoniID]) VALUES(2,200,3)
INSERT[dbo].[Fees] ([Kohezgjatja ne muaj],[Cmimi],[PersoniID]) VALUES(3,300,NULL)
INSERT[dbo].[Fees] ([Kohezgjatja ne muaj],[Cmimi],[PersoniID]) VALUES(4,400,NULL)
INSERT[dbo].[Fees] ([Kohezgjatja ne muaj],[Cmimi],[PersoniID]) VALUES(5,500,NULL)
SET IDENTITY_INSERT[dbo].[Fees] OFF

ALTER TABLE[dbo].[Fees] WITH CHECK ADD CONSTRAINT [FK_Fees_Personi] FOREIGN KEY([PersoniID])
REFERENCES [dbo].[Personi] ([ID])
GO
ALTER TABLE[dbo].[Fees] CHECK CONSTRAINT [FK_Fees_Personi]
GO

ALTER TABLE[dbo].[Equipments] WITH CHECK ADD CONSTRAINT[FK_Equipments_Classes] FOREIGN KEY ([ClassesID])
REFERENCES [dbo].[Classes] ([ID])
GO
ALTER TABLE [dbo].[Equipments] CHECK CONSTRAINT [FK_Equipments_Classes]
GO

ALTER TABLE [dbo].[Classes] WITH CHECK ADD CONSTRAINT [FK_Classes_Traineri] FOREIGN KEY([TraineriID])
REFERENCES [dbo].[Traineri] ([ID])
GO
ALTER TABLE [dbo].[Classes] CHECK CONSTRAINT [FK_Classes_Traineri]
GO
ALTER TABLE [dbo].[Personi]  WITH CHECK ADD  CONSTRAINT [FK_Personi_Traineri] FOREIGN KEY([TraineriID])
REFERENCES [dbo].[Traineri] ([ID])
GO
ALTER TABLE [dbo].[Personi] CHECK CONSTRAINT [FK_Personi_Traineri]
GO
USE [master]
GO
ALTER DATABASE [GymPlus2] SET  READ_WRITE 
GO

/*Shtojme pjesen e kodit per Login */
USE GymPlus2

CREATE TABLE [dbo].[Perdoruesi](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Username] [varchar](50) NULL,
	[Password] [varchar](550) NULL,
	[RoliID] [int] NULL,
 CONSTRAINT [PK_Perdoruesi] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

CREATE TABLE [dbo].[Roli](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Emertimi] [varchar](50) NULL,
 CONSTRAINT [PK_Roli] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

INSERT [dbo].[Perdoruesi] ([Username], [Password], [RoliID]) VALUES (N'rinesa.rexhepi', N'rinesa123', 1)
INSERT [dbo].[Perdoruesi] ([Username], [Password], [RoliID]) VALUES (N'user', N'user', 2)

INSERT [dbo].[Roli] ([Emertimi]) VALUES (N'Admini')
INSERT [dbo].[Roli] ([Emertimi]) VALUES (N'Useri')

ALTER TABLE [dbo].[Perdoruesi]  WITH CHECK ADD  CONSTRAINT [FK_Perdoruesi_Roli] FOREIGN KEY([RoliID])
REFERENCES [dbo].[Roli] ([ID])
GO
ALTER TABLE [dbo].[Perdoruesi] CHECK CONSTRAINT [FK_Perdoruesi_Roli]
GO