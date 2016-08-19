# AdCampaign
#Usage
Clone code from https://github.com/AnilSangroula/AdCampaign.git or download zip.

Run com.ad.Application.java with Spring boot application.

#Rest client

Tested with Advanced REST client for rest service consumption.

#Format

Data can be posted at http://localhost:8080/ad/ with JSON format as:
{
"id": 1001,
"duration": 2000000,
"ad_content": "Money is being used.....",
"partner": {
"id": "flood-campaign"
}
}

Data can be retrived with partner_id at http://localhost:8080/ad/flood-campaign

