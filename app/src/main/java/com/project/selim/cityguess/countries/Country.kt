package com.project.selim.cityguess.countries

import kotlinx.serialization.Serializable

@Serializable
class Country : ArrayList<CountryItem>()
@Serializable
data class CountryItem(
    val altSpellings: List<String>,
    val area: Double,
    val borders: List<String>,
    val capital: List<String>,
    val cca2: String,
    val cca3: String,
    val ccn3: String,
    val cioc: String,
    val currencies: Currencies,
    val demonyms: Demonyms,
    val flag: String,
    val idd: Idd,
    val independent: Boolean,
    val landlocked: Boolean,
    val languages: Languages,
    val latlng: List<Double>,
    val name: Name,
    val region: String,
    val status: String,
    val subregion: String,
    val tld: List<String>,
    val translations: Translations,
    val unMember: Boolean
)
@Serializable
data class Currencies(
    val AED: AED,
    val AFN: AFN,
    val ALL: ALL,
    val AMD: AMD,
    val ANG: ANG,
    val AOA: AOA,
    val ARS: ARS,
    val AUD: AUD,
    val AWG: AWG,
    val AZN: AZN,
    val BAM: BAM,
    val BBD: BBD,
    val BDT: BDT,
    val BGN: BGN,
    val BHD: BHD,
    val BIF: BIF,
    val BMD: BMD,
    val BND: BND,
    val BOB: BOB,
    val BRL: BRL,
    val BSD: BSD,
    val BTN: BTN,
    val BWP: BWP,
    val BYN: BYN,
    val BZD: BZD,
    val CAD: CAD,
    val CDF: CDF,
    val CHF: CHF,
    val CKD: CKD,
    val CLP: CLP,
    val CNY: CNY,
    val COP: COP,
    val CRC: CRC,
    val CUC: CUC,
    val CUP: CUP,
    val CVE: CVE,
    val CZK: CZK,
    val DJF: DJF,
    val DKK: DKK,
    val DOP: DOP,
    val DZD: DZD,
    val EGP: EGP,
    val ERN: ERN,
    val ETB: ETB,
    val EUR: EUR,
    val FJD: FJD,
    val FKP: FKP,
    val FOK: FOK,
    val GBP: GBP,
    val GEL: GEL,
    val GGP: GGP,
    val GHS: GHS,
    val GIP: GIP,
    val GMD: GMD,
    val GNF: GNF,
    val GTQ: GTQ,
    val GYD: GYD,
    val HKD: HKD,
    val HNL: HNL,
    val HTG: HTG,
    val HUF: HUF,
    val IDR: IDR,
    val ILS: ILS,
    val IMP: IMP,
    val INR: INR,
    val IQD: IQD,
    val IRR: IRR,
    val ISK: ISK,
    val JEP: JEP,
    val JMD: JMD,
    val JOD: JOD,
    val JPY: JPY,
    val KES: KES,
    val KGS: KGS,
    val KHR: KHR,
    val KID: KID,
    val KMF: KMF,
    val KPW: KPW,
    val KRW: KRW,
    val KWD: KWD,
    val KYD: KYD,
    val KZT: KZT,
    val LAK: LAK,
    val LBP: LBP,
    val LKR: LKR,
    val LRD: LRD,
    val LSL: LSL,
    val LYD: LYD,
    val MAD: MAD,
    val MDL: MDL,
    val MGA: MGA,
    val MKD: MKD,
    val MMK: MMK,
    val MNT: MNT,
    val MOP: MOP,
    val MRU: MRU,
    val MUR: MUR,
    val MVR: MVR,
    val MWK: MWK,
    val MXN: MXN,
    val MYR: MYR,
    val MZN: MZN,
    val NAD: NAD,
    val NGN: NGN,
    val NIO: NIO,
    val NOK: NOK,
    val NPR: NPR,
    val NZD: NZD,
    val OMR: OMR,
    val PAB: PAB,
    val PEN: PEN,
    val PGK: PGK,
    val PHP: PHP,
    val PKR: PKR,
    val PLN: PLN,
    val PYG: PYG,
    val QAR: QAR,
    val RON: RON,
    val RSD: RSD,
    val RUB: RUB,
    val RWF: RWF,
    val SAR: SAR,
    val SBD: SBD,
    val SCR: SCR,
    val SDG: SDG,
    val SEK: SEK,
    val SGD: SGD,
    val SHP: SHP,
    val SLL: SLL,
    val SOS: SOS,
    val SRD: SRD,
    val SSP: SSP,
    val STN: STN,
    val SYP: SYP,
    val SZL: SZL,
    val THB: THB,
    val TJS: TJS,
    val TMT: TMT,
    val TND: TND,
    val TOP: TOP,
    val TRY: TRY,
    val TTD: TTD,
    val TVD: TVD,
    val TWD: TWD,
    val TZS: TZS,
    val UAH: UAH,
    val UGX: UGX,
    val USD: USD,
    val UYU: UYU,
    val UZS: UZS,
    val VES: VES,
    val VND: VND,
    val VUV: VUV,
    val WST: WST,
    val XAF: XAF,
    val XCD: XCD,
    val XOF: XOF,
    val XPF: XPF,
    val YER: YER,
    val ZAR: ZAR,
    val ZMW: ZMW,
    val ZWB: ZWB
)
@Serializable
data class Demonyms(
    val eng: Eng,
    val fra: Fra
)
@Serializable
data class Idd(
    val root: String,
    val suffixes: List<String>
)
@Serializable
data class Languages(
    val afr: String,
    val amh: String,
    val ara: String,
    val arc: String,
    val aym: String,
    val aze: String,
    val bar: String,
    val bel: String,
    val ben: String,
    val ber: String,
    val bis: String,
    val bjz: String,
    val bos: String,
    val bul: String,
    val bwg: String,
    val cal: String,
    val cat: String,
    val ces: String,
    val cha: String,
    val ckb: String,
    val cnr: String,
    val crs: String,
    val dan: String,
    val deu: String,
    val div: String,
    val dzo: String,
    val ell: String,
    val eng: String,
    val est: String,
    val fao: String,
    val fas: String,
    val fij: String,
    val fil: String,
    val fin: String,
    val fra: String,
    val gil: String,
    val gle: String,
    val glv: String,
    val grn: String,
    val gsw: String,
    val hat: String,
    val heb: String,
    val her: String,
    val hgm: String,
    val hif: String,
    val hin: String,
    val hmo: String,
    val hrv: String,
    val hun: String,
    val hye: String,
    val ind: String,
    val isl: String,
    val ita: String,
    val jam: String,
    val jpn: String,
    val kal: String,
    val kat: String,
    val kaz: String,
    val kck: String,
    val khi: String,
    val khm: String,
    val kin: String,
    val kir: String,
    val kon: String,
    val kor: String,
    val kwn: String,
    val lao: String,
    val lat: String,
    val lav: String,
    val lin: String,
    val lit: String,
    val loz: String,
    val ltz: String,
    val lua: String,
    val mah: String,
    val mey: String,
    val mfe: String,
    val mkd: String,
    val mlg: String,
    val mlt: String,
    val mon: String,
    val mri: String,
    val msa: String,
    val mya: String,
    val nau: String,
    val nbl: String,
    val ndc: String,
    val nde: String,
    val ndo: String,
    val nep: String,
    val nfr: String,
    val niu: String,
    val nld: String,
    val nno: String,
    val nob: String,
    val nor: String,
    val nrf: String,
    val nso: String,
    val nya: String,
    val nzs: String,
    val pap: String,
    val pau: String,
    val pih: String,
    val pol: String,
    val por: String,
    val pov: String,
    val prs: String,
    val pus: String,
    val que: String,
    val rar: String,
    val roh: String,
    val ron: String,
    val run: String,
    val rus: String,
    val sag: String,
    val sin: String,
    val slk: String,
    val slv: String,
    val smi: String,
    val smo: String,
    val sna: String,
    val som: String,
    val sot: String,
    val spa: String,
    val sqi: String,
    val srp: String,
    val ssw: String,
    val swa: String,
    val swe: String,
    val tam: String,
    val tet: String,
    val tgk: String,
    val tha: String,
    val tir: String,
    val tkl: String,
    val toi: String,
    val ton: String,
    val tpi: String,
    val tsn: String,
    val tso: String,
    val tuk: String,
    val tur: String,
    val tvl: String,
    val ukr: String,
    val urd: String,
    val uzb: String,
    val ven: String,
    val vie: String,
    val xho: String,
    val zdj: String,
    val zho: String,
    val zib: String,
    val zul: String
)
@Serializable
data class Name(
    val common: String,
//    val native: Native,
    val official: String
)
@Serializable
data class Translations(
    val ces: Ces,
    val cym: Cym,
    val deu: Deu,
    val est: Est,
    val fin: Fin,
    val fra: Fra,
    val hrv: Hrv,
    val hun: Hun,
    val ita: Ita,
    val jpn: Jpn,
    val kor: Kor,
    val nld: Nld,
    val per: Per,
    val pol: Pol,
    val por: Por,
    val rus: Rus,
    val slk: Slk,
    val spa: Spa,
    val swe: Swe,
    val urd: Urd,
    val zho: Zho
)
@Serializable
data class AED(
    val name: String,
    val symbol: String
)
@Serializable
data class AFN(
    val name: String,
    val symbol: String
)
@Serializable
data class ALL(
    val name: String,
    val symbol: String
)
@Serializable
data class AMD(
    val name: String,
    val symbol: String
)
@Serializable
data class ANG(
    val name: String,
    val symbol: String
)
@Serializable
data class AOA(
    val name: String,
    val symbol: String
)
@Serializable
data class ARS(
    val name: String,
    val symbol: String
)
@Serializable
data class AUD(
    val name: String,
    val symbol: String
)
@Serializable
data class AWG(
    val name: String,
    val symbol: String
)
@Serializable
data class AZN(
    val name: String,
    val symbol: String
)
@Serializable
data class BAM(
    val name: String,
    val symbol: String
)
@Serializable
data class BBD(
    val name: String,
    val symbol: String
)
@Serializable
data class BDT(
    val name: String,
    val symbol: String
)
@Serializable
data class BGN(
    val name: String,
    val symbol: String
)
@Serializable
data class BHD(
    val name: String,
    val symbol: String
)
@Serializable
data class BIF(
    val name: String,
    val symbol: String
)
@Serializable
data class BMD(
    val name: String,
    val symbol: String
)
@Serializable
data class BND(
    val name: String,
    val symbol: String
)
@Serializable
data class BOB(
    val name: String,
    val symbol: String
)
@Serializable
data class BRL(
    val name: String,
    val symbol: String
)
@Serializable
data class BSD(
    val name: String,
    val symbol: String
)
@Serializable
data class BTN(
    val name: String,
    val symbol: String
)
@Serializable
data class BWP(
    val name: String,
    val symbol: String
)
@Serializable
data class BYN(
    val name: String,
    val symbol: String
)
@Serializable
data class BZD(
    val name: String,
    val symbol: String
)
@Serializable
data class CAD(
    val name: String,
    val symbol: String
)
@Serializable
data class CDF(
    val name: String,
    val symbol: String
)
@Serializable
data class CHF(
    val name: String,
    val symbol: String
)
@Serializable
data class CKD(
    val name: String,
    val symbol: String
)
@Serializable
data class CLP(
    val name: String,
    val symbol: String
)
@Serializable
data class CNY(
    val name: String,
    val symbol: String
)
@Serializable
data class COP(
    val name: String,
    val symbol: String
)
@Serializable
data class CRC(
    val name: String,
    val symbol: String
)
@Serializable
data class CUC(
    val name: String,
    val symbol: String
)
@Serializable
data class CUP(
    val name: String,
    val symbol: String
)
@Serializable
data class CVE(
    val name: String,
    val symbol: String
)
@Serializable
data class CZK(
    val name: String,
    val symbol: String
)
@Serializable
data class DJF(
    val name: String,
    val symbol: String
)
@Serializable
data class DKK(
    val name: String,
    val symbol: String
)
@Serializable
data class DOP(
    val name: String,
    val symbol: String
)
@Serializable
data class DZD(
    val name: String,
    val symbol: String
)
@Serializable
data class EGP(
    val name: String,
    val symbol: String
)
@Serializable
data class ERN(
    val name: String,
    val symbol: String
)
@Serializable
data class ETB(
    val name: String,
    val symbol: String
)
@Serializable
data class EUR(
    val name: String,
    val symbol: String
)
@Serializable
data class FJD(
    val name: String,
    val symbol: String
)
@Serializable
data class FKP(
    val name: String,
    val symbol: String
)
@Serializable
data class FOK(
    val name: String,
    val symbol: String
)
@Serializable
data class GBP(
    val name: String,
    val symbol: String
)
@Serializable
data class GEL(
    val name: String,
    val symbol: String
)
@Serializable
data class GGP(
    val name: String,
    val symbol: String
)
@Serializable
data class GHS(
    val name: String,
    val symbol: String
)
@Serializable
data class GIP(
    val name: String,
    val symbol: String
)
@Serializable
data class GMD(
    val name: String,
    val symbol: String
)
@Serializable
data class GNF(
    val name: String,
    val symbol: String
)
@Serializable
data class GTQ(
    val name: String,
    val symbol: String
)
@Serializable
data class GYD(
    val name: String,
    val symbol: String
)
@Serializable
data class HKD(
    val name: String,
    val symbol: String
)
@Serializable
data class HNL(
    val name: String,
    val symbol: String
)
@Serializable
data class HTG(
    val name: String,
    val symbol: String
)
@Serializable
data class HUF(
    val name: String,
    val symbol: String
)
@Serializable
data class IDR(
    val name: String,
    val symbol: String
)
@Serializable
data class ILS(
    val name: String,
    val symbol: String
)
@Serializable
data class IMP(
    val name: String,
    val symbol: String
)
@Serializable
data class INR(
    val name: String,
    val symbol: String
)
@Serializable
data class IQD(
    val name: String,
    val symbol: String
)
@Serializable
data class IRR(
    val name: String,
    val symbol: String
)
@Serializable
data class ISK(
    val name: String,
    val symbol: String
)
@Serializable
data class JEP(
    val name: String,
    val symbol: String
)
@Serializable
data class JMD(
    val name: String,
    val symbol: String
)
@Serializable
data class JOD(
    val name: String,
    val symbol: String
)
@Serializable
data class JPY(
    val name: String,
    val symbol: String
)
@Serializable
data class KES(
    val name: String,
    val symbol: String
)
@Serializable
data class KGS(
    val name: String,
    val symbol: String
)
@Serializable
data class KHR(
    val name: String,
    val symbol: String
)
@Serializable
data class KID(
    val name: String,
    val symbol: String
)
@Serializable
data class KMF(
    val name: String,
    val symbol: String
)
@Serializable
data class KPW(
    val name: String,
    val symbol: String
)
@Serializable
data class KRW(
    val name: String,
    val symbol: String
)
@Serializable
data class KWD(
    val name: String,
    val symbol: String
)
@Serializable
data class KYD(
    val name: String,
    val symbol: String
)
@Serializable
data class KZT(
    val name: String,
    val symbol: String
)
@Serializable
data class LAK(
    val name: String,
    val symbol: String
)
@Serializable
data class LBP(
    val name: String,
    val symbol: String
)
@Serializable
data class LKR(
    val name: String,
    val symbol: String
)
@Serializable
data class LRD(
    val name: String,
    val symbol: String
)
@Serializable
data class LSL(
    val name: String,
    val symbol: String
)
@Serializable
data class LYD(
    val name: String,
    val symbol: String
)
@Serializable
data class MAD(
    val name: String,
    val symbol: String
)
@Serializable
data class MDL(
    val name: String,
    val symbol: String
)
@Serializable
data class MGA(
    val name: String,
    val symbol: String
)
@Serializable
data class MKD(
    val name: String,
    val symbol: String
)
@Serializable
data class MMK(
    val name: String,
    val symbol: String
)
@Serializable
data class MNT(
    val name: String,
    val symbol: String
)
@Serializable
data class MOP(
    val name: String,
    val symbol: String
)
@Serializable
data class MRU(
    val name: String,
    val symbol: String
)
@Serializable
data class MUR(
    val name: String,
    val symbol: String
)
@Serializable
data class MVR(
    val name: String,
    val symbol: String
)
@Serializable
data class MWK(
    val name: String,
    val symbol: String
)
@Serializable
data class MXN(
    val name: String,
    val symbol: String
)
@Serializable
data class MYR(
    val name: String,
    val symbol: String
)
@Serializable
data class MZN(
    val name: String,
    val symbol: String
)
@Serializable
data class NAD(
    val name: String,
    val symbol: String
)
@Serializable
data class NGN(
    val name: String,
    val symbol: String
)
@Serializable
data class NIO(
    val name: String,
    val symbol: String
)
@Serializable
data class NOK(
    val name: String,
    val symbol: String
)
@Serializable
data class NPR(
    val name: String,
    val symbol: String
)
@Serializable
data class NZD(
    val name: String,
    val symbol: String
)
@Serializable
data class OMR(
    val name: String,
    val symbol: String
)
@Serializable
data class PAB(
    val name: String,
    val symbol: String
)
@Serializable
data class PEN(
    val name: String,
    val symbol: String
)
@Serializable
data class PGK(
    val name: String,
    val symbol: String
)
@Serializable
data class PHP(
    val name: String,
    val symbol: String
)
@Serializable
data class PKR(
    val name: String,
    val symbol: String
)
@Serializable
data class PLN(
    val name: String,
    val symbol: String
)
@Serializable
data class PYG(
    val name: String,
    val symbol: String
)
@Serializable
data class QAR(
    val name: String,
    val symbol: String
)
@Serializable
data class RON(
    val name: String,
    val symbol: String
)
@Serializable
data class RSD(
    val name: String,
    val symbol: String
)
@Serializable
data class RUB(
    val name: String,
    val symbol: String
)
@Serializable
data class RWF(
    val name: String,
    val symbol: String
)
@Serializable
data class SAR(
    val name: String,
    val symbol: String
)
@Serializable
data class SBD(
    val name: String,
    val symbol: String
)
@Serializable
data class SCR(
    val name: String,
    val symbol: String
)
@Serializable
data class SDG(
    val name: String,
    val symbol: String
)
@Serializable
data class SEK(
    val name: String,
    val symbol: String
)
@Serializable
data class SGD(
    val name: String,
    val symbol: String
)
@Serializable
data class SHP(
    val name: String,
    val symbol: String
)
@Serializable
data class SLL(
    val name: String,
    val symbol: String
)
@Serializable
data class SOS(
    val name: String,
    val symbol: String
)
@Serializable
data class SRD(
    val name: String,
    val symbol: String
)
@Serializable
data class SSP(
    val name: String,
    val symbol: String
)
@Serializable
data class STN(
    val name: String,
    val symbol: String
)
@Serializable
data class SYP(
    val name: String,
    val symbol: String
)
@Serializable
data class SZL(
    val name: String,
    val symbol: String
)
@Serializable
data class THB(
    val name: String,
    val symbol: String
)
@Serializable
data class TJS(
    val name: String,
    val symbol: String
)
@Serializable
data class TMT(
    val name: String,
    val symbol: String
)
@Serializable
data class TND(
    val name: String,
    val symbol: String
)
@Serializable
data class TOP(
    val name: String,
    val symbol: String
)
@Serializable
data class TRY(
    val name: String,
    val symbol: String
)
@Serializable
data class TTD(
    val name: String,
    val symbol: String
)
@Serializable
data class TVD(
    val name: String,
    val symbol: String
)
@Serializable
data class TWD(
    val name: String,
    val symbol: String
)
@Serializable
data class TZS(
    val name: String,
    val symbol: String
)
@Serializable
data class UAH(
    val name: String,
    val symbol: String
)
@Serializable
data class UGX(
    val name: String,
    val symbol: String
)
@Serializable
data class USD(
    val name: String,
    val symbol: String
)
@Serializable
data class UYU(
    val name: String,
    val symbol: String
)
@Serializable
data class UZS(
    val name: String,
    val symbol: String
)
@Serializable
data class VES(
    val name: String,
    val symbol: String
)
@Serializable
data class VND(
    val name: String,
    val symbol: String
)
@Serializable
data class VUV(
    val name: String,
    val symbol: String
)
@Serializable
data class WST(
    val name: String,
    val symbol: String
)
@Serializable
data class XAF(
    val name: String,
    val symbol: String
)
@Serializable
data class XCD(
    val name: String,
    val symbol: String
)
@Serializable
data class XOF(
    val name: String,
    val symbol: String
)
@Serializable
data class XPF(
    val name: String,
    val symbol: String
)
@Serializable
data class YER(
    val name: String,
    val symbol: String
)
@Serializable
data class ZAR(
    val name: String,
    val symbol: String
)
@Serializable
data class ZMW(
    val name: String,
    val symbol: String
)
@Serializable
data class ZWB(
    val name: String,
    val symbol: String
)
@Serializable
data class Eng(
    val f: String,
    val m: String
)
@Serializable
data class Fra(
    val f: String,
    val m: String
)
@Serializable
data class Native(
    val afr: Afr,
    val amh: Amh,
    val ara: Ara,
    val arc: Arc,
    val aym: Aym,
    val aze: Aze,
    val bar: Bar,
    val bel: Bel,
    val ben: Ben,
    val ber: Ber,
    val bis: Bis,
    val bjz: Bjz,
    val bos: Bos,
    val bul: Bul,
    val bwg: Bwg,
    val cal: Cal,
    val cat: Cat,
    val ces: Ces,
    val cha: Cha,
    val ckb: Ckb,
    val cnr: Cnr,
    val crs: Crs,
    val dan: Dan,
    val deu: Deu,
    val div: Div,
    val dzo: Dzo,
    val ell: Ell,
    val eng: EngX,
    val est: Est,
    val fao: Fao,
    val fas: Fas,
    val fij: Fij,
    val fil: Fil,
    val fin: Fin,
    val fra: FraX,
    val gil: Gil,
    val gle: Gle,
    val glv: Glv,
    val grn: Grn,
    val gsw: Gsw,
    val hat: Hat,
    val heb: Heb,
    val her: Her,
    val hgm: Hgm,
    val hif: Hif,
    val hin: Hin,
    val hmo: Hmo,
    val hrv: Hrv,
    val hun: Hun,
    val hye: Hye,
    val ind: Ind,
    val isl: Isl,
    val ita: Ita,
    val jam: Jam,
    val jpn: Jpn,
    val kal: Kal,
    val kat: Kat,
    val kaz: Kaz,
    val kck: Kck,
    val khi: Khi,
    val khm: Khm,
    val kin: Kin,
    val kir: Kir,
    val kon: Kon,
    val kor: Kor,
    val kwn: Kwn,
    val lao: Lao,
    val lat: Lat,
    val lav: Lav,
    val lin: Lin,
    val lit: Lit,
    val loz: Loz,
    val ltz: Ltz,
    val lua: Lua,
    val mah: Mah,
    val mey: Mey,
    val mfe: Mfe,
    val mkd: MkdX,
    val mlg: Mlg,
    val mlt: Mlt,
    val mon: Mon,
    val mri: Mri,
    val msa: Msa,
    val mya: Mya,
    val nau: Nau,
    val nbl: Nbl,
    val ndc: Ndc,
    val nde: Nde,
    val ndo: Ndo,
    val nep: Nep,
    val nfr: Nfr,
    val niu: Niu,
    val nld: Nld,
    val nno: Nno,
    val nob: Nob,
    val nor: Nor,
    val nrf: Nrf,
    val nso: Nso,
    val nya: Nya,
    val nzs: Nzs,
    val pap: Pap,
    val pau: Pau,
    val pih: Pih,
    val pol: Pol,
    val por: Por,
    val pov: Pov,
    val prs: Prs,
    val pus: Pus,
    val que: Que,
    val rar: Rar,
    val roh: Roh,
    val ron: RonX,
    val run: Run,
    val rus: Rus,
    val sag: Sag,
    val sin: Sin,
    val slk: Slk,
    val slv: Slv,
    val smi: Smi,
    val smo: Smo,
    val sna: Sna,
    val som: Som,
    val sot: Sot,
    val spa: Spa,
    val sqi: Sqi,
    val srp: Srp,
    val ssw: Ssw,
    val swa: Swa,
    val swe: Swe,
    val tam: Tam,
    val tet: Tet,
    val tgk: Tgk,
    val tha: Tha,
    val tir: Tir,
    val tkl: Tkl,
    val toi: Toi,
    val ton: Ton,
    val tpi: Tpi,
    val tsn: Tsn,
    val tso: Tso,
    val tuk: Tuk,
    val tur: Tur,
    val tvl: Tvl,
    val ukr: Ukr,
    val urd: Urd,
    val uzb: Uzb,
    val ven: Ven,
    val vie: Vie,
    val xho: Xho,
    val zdj: Zdj,
    val zho: Zho,
    val zib: Zib,
    val zul: Zul
)
@Serializable
data class Afr(
    val common: String,
    val official: String
)
@Serializable
data class Amh(
    val common: String,
    val official: String
)
@Serializable
data class Ara(
    val common: String,
    val official: String
)
@Serializable
data class Arc(
    val common: String,
    val official: String
)
@Serializable
data class Aym(
    val common: String,
    val official: String
)
@Serializable
data class Aze(
    val common: String,
    val official: String
)
@Serializable
data class Bar(
    val common: String,
    val official: String
)
@Serializable
data class Bel(
    val common: String,
    val official: String
)
@Serializable
data class Ben(
    val common: String,
    val official: String
)
@Serializable
data class Ber(
    val common: String,
    val official: String
)
@Serializable
data class Bis(
    val common: String,
    val official: String
)
@Serializable
data class Bjz(
    val common: String,
    val official: String
)
@Serializable
data class Bos(
    val common: String,
    val official: String
)
@Serializable
data class Bul(
    val common: String,
    val official: String
)
@Serializable
data class Bwg(
    val common: String,
    val official: String
)
@Serializable
data class Cal(
    val common: String,
    val official: String
)
@Serializable
data class Cat(
    val common: String,
    val official: String
)
@Serializable
data class Ces(
    val common: String,
    val official: String
)
@Serializable
data class Cha(
    val common: String,
    val official: String
)
@Serializable
data class Ckb(
    val common: String,
    val official: String
)
@Serializable
data class Cnr(
    val common: String,
    val official: String
)
@Serializable
data class Crs(
    val common: String,
    val official: String
)
@Serializable
data class Dan(
    val common: String,
    val official: String
)
@Serializable
data class Deu(
    val common: String,
    val official: String
)
@Serializable
data class Div(
    val common: String,
    val official: String
)
@Serializable
data class Dzo(
    val common: String,
    val official: String
)
@Serializable
data class Ell(
    val common: String,
    val official: String
)
@Serializable
data class EngX(
    val common: String,
    val official: String
)
@Serializable
data class Est(
    val common: String,
    val official: String
)
@Serializable
data class Fao(
    val common: String,
    val official: String
)
@Serializable
data class Fas(
    val common: String,
    val official: String
)
@Serializable
data class Fij(
    val common: String,
    val official: String
)
@Serializable
data class Fil(
    val common: String,
    val official: String
)
@Serializable
data class Fin(
    val common: String,
    val official: String
)
@Serializable
data class FraX(
    val common: String,
    val official: String
)
@Serializable
data class Gil(
    val common: String,
    val official: String
)
@Serializable
data class Gle(
    val common: String,
    val official: String
)
@Serializable
data class Glv(
    val common: String,
    val official: String
)
@Serializable
data class Grn(
    val common: String,
    val official: String
)
@Serializable
data class Gsw(
    val common: String,
    val official: String
)
@Serializable
data class Hat(
    val common: String,
    val official: String
)
@Serializable
data class Heb(
    val common: String,
    val official: String
)
@Serializable
data class Her(
    val common: String,
    val official: String
)
@Serializable
data class Hgm(
    val common: String,
    val official: String
)
@Serializable
data class Hif(
    val common: String,
    val official: String
)
@Serializable
data class Hin(
    val common: String,
    val official: String
)
@Serializable
data class Hmo(
    val common: String,
    val official: String
)
@Serializable
data class Hrv(
    val common: String,
    val official: String
)
@Serializable
data class Hun(
    val common: String,
    val official: String
)
@Serializable
data class Hye(
    val common: String,
    val official: String
)
@Serializable
data class Ind(
    val common: String,
    val official: String
)
@Serializable
data class Isl(
    val common: String,
    val official: String
)
@Serializable
data class Ita(
    val common: String,
    val official: String
)
@Serializable
data class Jam(
    val common: String,
    val official: String
)
@Serializable
data class Jpn(
    val common: String,
    val official: String
)
@Serializable
data class Kal(
    val common: String,
    val official: String
)
@Serializable
data class Kat(
    val common: String,
    val official: String
)
@Serializable
data class Kaz(
    val common: String,
    val official: String
)
@Serializable
data class Kck(
    val common: String,
    val official: String
)
@Serializable
data class Khi(
    val common: String,
    val official: String
)
@Serializable
data class Khm(
    val common: String,
    val official: String
)
@Serializable
data class Kin(
    val common: String,
    val official: String
)
@Serializable
data class Kir(
    val common: String,
    val official: String
)
@Serializable
data class Kon(
    val common: String,
    val official: String
)
@Serializable
data class Kor(
    val common: String,
    val official: String
)
@Serializable
data class Kwn(
    val common: String,
    val official: String
)
@Serializable
data class Lao(
    val common: String,
    val official: String
)
@Serializable
data class Lat(
    val common: String,
    val official: String
)
@Serializable
data class Lav(
    val common: String,
    val official: String
)
@Serializable
data class Lin(
    val common: String,
    val official: String
)
@Serializable
data class Lit(
    val common: String,
    val official: String
)
@Serializable
data class Loz(
    val common: String,
    val official: String
)
@Serializable
data class Ltz(
    val common: String,
    val official: String
)
@Serializable
data class Lua(
    val common: String,
    val official: String
)
@Serializable
data class Mah(
    val common: String,
    val official: String
)
@Serializable
data class Mey(
    val common: String,
    val official: String
)
@Serializable
data class Mfe(
    val common: String,
    val official: String
)
@Serializable
data class MkdX(
    val common: String,
    val official: String
)
@Serializable
data class Mlg(
    val common: String,
    val official: String
)
@Serializable
data class Mlt(
    val common: String,
    val official: String
)
@Serializable
data class Mon(
    val common: String,
    val official: String
)
@Serializable
data class Mri(
    val common: String,
    val official: String
)
@Serializable
data class Msa(
    val common: String,
    val official: String
)
@Serializable
data class Mya(
    val common: String,
    val official: String
)
@Serializable
data class Nau(
    val common: String,
    val official: String
)
@Serializable
data class Nbl(
    val common: String,
    val official: String
)
@Serializable
data class Ndc(
    val common: String,
    val official: String
)
@Serializable
data class Nde(
    val common: String,
    val official: String
)
@Serializable
data class Ndo(
    val common: String,
    val official: String
)
@Serializable
data class Nep(
    val common: String,
    val official: String
)
@Serializable
data class Nfr(
    val common: String,
    val official: String
)
@Serializable
data class Niu(
    val common: String,
    val official: String
)
@Serializable
data class Nld(
    val common: String,
    val official: String
)
@Serializable
data class Nno(
    val common: String,
    val official: String
)
@Serializable
data class Nob(
    val common: String,
    val official: String
)
@Serializable
data class Nor(
    val common: String,
    val official: String
)
@Serializable
data class Nrf(
    val common: String,
    val official: String
)
@Serializable
data class Nso(
    val common: String,
    val official: String
)
@Serializable
data class Nya(
    val common: String,
    val official: String
)
@Serializable
data class Nzs(
    val common: String,
    val official: String
)
@Serializable
data class Pap(
    val common: String,
    val official: String
)
@Serializable
data class Pau(
    val common: String,
    val official: String
)
@Serializable
data class Pih(
    val common: String,
    val official: String
)
@Serializable
data class Pol(
    val common: String,
    val official: String
)
@Serializable
data class Por(
    val common: String,
    val official: String
)
@Serializable
data class Pov(
    val common: String,
    val official: String
)
@Serializable
data class Prs(
    val common: String,
    val official: String
)
@Serializable
data class Pus(
    val common: String,
    val official: String
)
@Serializable
data class Que(
    val common: String,
    val official: String
)
@Serializable
data class Rar(
    val common: String,
    val official: String
)
@Serializable
data class Roh(
    val common: String,
    val official: String
)
@Serializable
data class RonX(
    val common: String,
    val official: String
)
@Serializable
data class Run(
    val common: String,
    val official: String
)
@Serializable
data class Rus(
    val common: String,
    val official: String
)
@Serializable
data class Sag(
    val common: String,
    val official: String
)
@Serializable
data class Sin(
    val common: String,
    val official: String
)
@Serializable
data class Slk(
    val common: String,
    val official: String
)
@Serializable
data class Slv(
    val common: String,
    val official: String
)
@Serializable
data class Smi(
    val common: String,
    val official: String
)
@Serializable
data class Smo(
    val common: String,
    val official: String
)
@Serializable
data class Sna(
    val common: String,
    val official: String
)
@Serializable
data class Som(
    val common: String,
    val official: String
)
@Serializable
data class Sot(
    val common: String,
    val official: String
)
@Serializable
data class Spa(
    val common: String,
    val official: String
)
@Serializable
data class Sqi(
    val common: String,
    val official: String
)
@Serializable
data class Srp(
    val common: String,
    val official: String
)
@Serializable
data class Ssw(
    val common: String,
    val official: String
)
@Serializable
data class Swa(
    val common: String,
    val official: String
)
@Serializable
data class Swe(
    val common: String,
    val official: String
)
@Serializable
data class Tam(
    val common: String,
    val official: String
)
@Serializable
data class Tet(
    val common: String,
    val official: String
)
@Serializable
data class Tgk(
    val common: String,
    val official: String
)
@Serializable
data class Tha(
    val common: String,
    val official: String
)
@Serializable
data class Tir(
    val common: String,
    val official: String
)
@Serializable
data class Tkl(
    val common: String,
    val official: String
)
@Serializable
data class Toi(
    val common: String,
    val official: String
)
@Serializable
data class Ton(
    val common: String,
    val official: String
)
@Serializable
data class Tpi(
    val common: String,
    val official: String
)
@Serializable
data class Tsn(
    val common: String,
    val official: String
)
@Serializable
data class Tso(
    val common: String,
    val official: String
)
@Serializable
data class Tuk(
    val common: String,
    val official: String
)
@Serializable
data class Tur(
    val common: String,
    val official: String
)
@Serializable
data class Tvl(
    val common: String,
    val official: String
)
@Serializable
data class Ukr(
    val common: String,
    val official: String
)
@Serializable
data class Urd(
    val common: String,
    val official: String
)
@Serializable
data class Uzb(
    val common: String,
    val official: String
)
@Serializable
data class Ven(
    val common: String,
    val official: String
)
@Serializable
data class Vie(
    val common: String,
    val official: String
)
@Serializable
data class Xho(
    val common: String,
    val official: String
)
@Serializable
data class Zdj(
    val common: String,
    val official: String
)
@Serializable
data class Zho(
    val common: String,
    val official: String
)
@Serializable
data class Zib(
    val common: String,
    val official: String
)
@Serializable
data class Zul(
    val common: String,
    val official: String
)
@Serializable
data class Cym(
    val common: String,
    val official: String
)
@Serializable
data class Per(
    val common: String,
    val official: String
)