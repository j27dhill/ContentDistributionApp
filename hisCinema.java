public class hisCinema extends DummyDNS{
	public hisCinema(){
		super(getHisCinemaNameServer(), false, false);
	}
		public DummyDNS getHisCinemaNameServer(){
			DummyDNS dnsserver = new DummyDNS();
			DNSEntry entry = new DNSEntry("vid.hiscinema.com", "herCDN.com", Type));
			dnsserver.addRecord(entry);
			return dnsserver;
		}
	}
}